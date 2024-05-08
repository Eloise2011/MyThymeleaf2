package elo.pra.config;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-05 15:53
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String lang = request.getParameter("lang"); //zh_CN
        Locale locale = request.getLocale();
        if(!StringUtils.isEmpty(lang)){
            String[] data = lang.split("_");
            locale = new Locale(data[0], data[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
