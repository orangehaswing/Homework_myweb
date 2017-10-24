package test.Webfunc;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Upload extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        fileControl(req, resp);
    }

    private void fileControl(HttpServletRequest req, HttpServletResponse resp) {
       /*// 在解析请求之前先判断请求类型是否为文件上传类型
        boolean isMultipart = ServletFileUpload.isMultipartContent(req);

//        if (!isMultipart) {
//            return;
//        }

        req.setAttribute("message","文件是上傳類型");

        // 文件上传处理工厂
        FileItemFactory factory = new DiskFileItemFactory();

        // 创建文件上传处理器
        ServletFileUpload upload = new ServletFileUpload(factory);

        // 开始解析请求信息
        List items = null;
        try {
            items = upload.parseRequest(req);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

        // 对所有请求信息进行判断
        Iterator iter = items.iterator();
        while (iter.hasNext()) {
            FileItem item = (FileItem) iter.next();
            // 信息为普通的格式
            if (item.isFormField()) {
                String fieldName = item.getFieldName();
                String value = item.getString();
                req.setAttribute(fieldName, value);
            }
            // 信息为文件格式
            else {
                String fileName = item.getName();
                int index = fileName.lastIndexOf("\\");
                fileName = fileName.substring(index + 1);
                req.setAttribute("realFileName", fileName);

                // 将文件写入
                //                String path = req.getContextPath();
                //                String directory = "uploadFile";
                //                String basePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + path + "/" + directory;
                String basePath = req.getRealPath("/uploadFile");
                File file = new File(basePath, fileName);
                try {
                    item.write(file);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }*/

        try {
            req.getRequestDispatcher("/FormulaEdit.jsp").forward(req, resp);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

}

