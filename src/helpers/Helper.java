package helpers;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class Helper {

    private static Configuration cfg = null;

    public static Configuration getConfig(HttpServletRequest req) {
        if (cfg == null) {
            cfg = new Configuration(Configuration.VERSION_2_3_22);
            cfg.setServletContextForTemplateLoading(req.getServletContext(), "/WEB-INF/templates");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
            cfg.setDefaultEncoding("UTF-8");
        }
        return cfg;
    }

    public static void render(HttpServletRequest request, HttpServletResponse response,
                              String path, Map<String, Object> root) {

        Configuration cfg = Helper.getConfig(request);
        try {
            Template tmpl = cfg.getTemplate(path);
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            tmpl.process(root, response.getWriter());

        } catch (TemplateException | IOException e) {
            e.printStackTrace();
        }
    }
}