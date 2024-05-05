## 表达式
1. ${} 变量表达式 
2. *{} 选择表达式
3. @{} 链接表达式
不同选择表达式演示:
```java
package elo.pra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Joshua.H.Brooks
 * @description
 * @date 2024-05-05 10:40
 */
@Controller
public class LinkController {
    @RequestMapping("/link/var/test")
    public String linkTest(Model model) {
        model.addAttribute("queryStudent", "/query/student");
        return "link";
    }
}
```
index.html 添加了一行: **2. Link Expression**
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>1st Thymeleaf - with SpringBoot</title>
</head>

<body>
    <h1 th:text="${name}"></h1>
    <a href="/hello">0. Thymeleaf-SpringBoot | Homepage</a> <br/>
    <a href="/expressionVar1">1. Variable Expression</a> <br/>
    <a href="/link/var/test">2. Link Expression</a> <br/>
</body>
</html>
```
link.html
```html
<!Doctype HTML>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8"/>
    <title>Expression Variables</title>
</head>
<body>
<p>相对路径链接:</p>
<a th:href="@{queryStudent}">1. @{queryStudent}</a> <br />
<a th:href="@{./queryStudent}">2. ./queryStudent</a> <br />
<a th:href="@{../user/list}">3. ../user/list</a> <br />
<a th:href="@{/user/home}">4. /user/home</a> <br />
<a th:href="@{http://www.baidu.com}">5. http://www.baidu.com</a>

<div>
    <span>
        <p>
            链接表达式的使用场景
                页面导航：在网站或应用程序中生成页面之间的导航链接。
                动态参数：生成带有动态参数的链接，例如用户个人资料页面。
                外部链接：生成指向外部网站或资源的链接。
                防止硬编码：避免在 HTML 中硬编码链接，使得链接更易于管理和维护。
        </p>
    </span>
</div>
</body>
</html>
```
当通过controller访问index.html页面然后跳转到link.html页面后,会看到如下几个链接:

