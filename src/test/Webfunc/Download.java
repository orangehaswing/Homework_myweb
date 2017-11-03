package test.Webfunc;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

public class Download extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到要下载的文件名
        String fileName = req.getParameter("filename");
        fileName = new String(fileName.getBytes("iso8859-1"), "UTF-8");

        String fileSaveRootPath = this.getServletContext().getRealPath("/WEB-INF/upload");

        String path = fileSaveRootPath + "\\" + fileName;
//        path = path.replaceAll("\\\\","");

        File file = new File(path);

        long size = file.length();

        System.out.println("path:" + path + "   filesize:" + size);

        //创建缓冲区
        //为了解决中文名称乱码问题 这里是设置文件下载后的名称
        resp.reset();
        resp.setHeader("Accept-Ranges", "bytes");
        //设置文件下载是以附件的形式下载
        resp.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName));
        resp.addHeader("Content-Length", String.valueOf(size));

        ServletOutputStream sos = resp.getOutputStream();
        FileInputStream in = new FileInputStream(file);
        BufferedOutputStream outputStream = new BufferedOutputStream(sos);

        byte[] b = new byte[1024 * 2];//每次传输2K
        long filecomplateSize = 0L;
        double rateSpeed = 0;//速度
        long rateProcess = 0L;//进度
        int readSize = 0;
        int i = 0;
        int nbytes = 0;
        long startTime = System.nanoTime();
        //这里是下载进度和速度的简单实现 没有使用单独的线程进行速度计算
        while ((readSize = in.read(b)) > 0) {
            if (i % 20 == 0) {
                startTime = System.nanoTime();
            }
            filecomplateSize = filecomplateSize + readSize;
            outputStream.write(b, 0, readSize);
            nbytes = readSize + nbytes;
            if (i % 20 == 19) {
                rateProcess = filecomplateSize / size;
                //时间差  System.nanoTime()的返回值精确度是毫微秒
                double currentTime = (System.nanoTime() - startTime);
                //将速度转化成比较通用的MB/S
                rateSpeed = ((nbytes / currentTime) * 1000 * 1000 * 1000) / 1024 / 1024;
                String strrateSpeed = String.format("%.2f", rateSpeed);
                rateSpeed = Double.valueOf(strrateSpeed);
                System.out.println(rateSpeed);
                System.out.println(rateSpeed);
                nbytes = 0;
            }
            i++;
        }
        outputStream.flush();
        outputStream.close();
        sos.close();
        in.close();
    }
}
