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
 
 
| 标签               | 意义                                                 |
|:-----------------|:---------------------------------------------------|
| th:text          | 计算其值表达式并将结果设置为标签的标签体                               |
| th:utext         | th:text 会对结果中的特殊字符转义，th:utext 不会转义                 |
| th:attr          | 为标签中的任意属性设置，可以一次设置多个属性                             |
| th:*             | 为 html 指定的属性设值，一次设置一个                              |
| th:alt-title     | 同时为 alt 与 title 属性赋值                               |
| th:lang-xmllang* | 同时为lang和xml:lang 属性赋值                              |
| th:fragment      | 定义模板片,以便复用该片段                                      |
| th:insert        | 将被引用的模板片段插入到自己的标签体中心                               |
| th:replace       | 将被引用的模板片段替换掉自己                                     |
| th:include       | 类似于 th:insert，但是它只插入此片段的<容,而不是插入片段 **~~现已不推荐使用~~** |
| th:remove        | 删除模板中的某些片段内容                                       |
| th:if            | 条件为true时显示该标签属性所在片段, 否在不显示                         |
| th:unless        | 条件为false时显示该标签属性所在片段, 否在不显示                        |
| th:each          | 迭代数据,如数组,list,map等                                 |
| th:switch        | 与Java中的switch等效,有条件的显示匹配内容                         |
| th:case          | 配合th:switch使用                                      |
| th:with          | 定义局部变量                                             |
| th:inline        | 禁用内联表达式,内联js,内联css                                 |
|                  |                                                    |
|                  |                                                    |




th:checked属性特性: 当解析模板后发现:${selected}=true,所以th:checked=checked, Swim为勾选状态,而${unselected}=false, 则th:checked属性会被直接去除掉
```html
<input type="checkbox" value="游泳" th:checked="${selected}"> Swim
<input type="checkbox" value="健身" th:checked="${unselected}"> Gym
```

**Controller:**
![BodyController.png](BodyController.png)
**HTML:**
![bodyhtml.png](bodyhtml.png)
**结果演示:**
![th:text & th:utext](ResultOfthtext.png)

![源码查看转义符体现.png](%E6%BA%90%E7%A0%81%E6%9F%A5%E7%9C%8B%E8%BD%AC%E4%B9%89%E7%AC%A6%E4%BD%93%E7%8E%B0.png)

特点：←

1. 循环的对象如果是 null，不存在则不循环。 
2. 循环包含自身和标签内全部内容
3. 可以遍的対象：
    - 数组
    - 任何实现 `java.util.Iterable` 接口的对象
    - Enumeration 枚举
    - 实现 Map 接口对象

**浯法格式:**
```html
<tr th:each=成長遍方：${表法式}>
<td th:text=“$｛成员｝“>列</td>
</tr>
```

使用`th:each` 时, Thymeleaf 提供了一种用于跟踪迭代状态的机制：状态变量。状态变量在每个 `th:each` 属性中定义，并包含以下数据：

1. index 属性：当前迭代索引，从0开始” 
2. count 属性：当前的迭代计数，从1开始 
3. size 属性：迭代变量中元素的总量 
4. current 属性：每次迭代的 iter 变量，即当前遍历到的元素 
5. even/odd 布尔属性：当前的迭代是偶数还是奇数。
6. first 布尔属性：当前的迭代是歪是第一个迭代
7. last 布尔属性：当前的迭代是否是最后一个迭代。