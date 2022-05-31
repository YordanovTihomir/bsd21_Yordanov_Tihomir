# Maven Site

***

### Javadoc comments
Javadoc comments are very significant part of the creation of the document because the
indicate what should the JDK javadoc tool take for the preparation of the documentation.

***

### Difference between site.xml and pom.xml
When the pom.xml file configure the whole project, site.xml provide configurations
for custom maven documentation site. Pom.xml contains the dependencies and plugins for
successful creation of the site.

***

### Custom page
To create a custom Maven Documentation Site you need to create a folder in source code
folder and initialize a xml-file inside which contains the structure of your custom page (site.xml)
Additionally you could add an apt-folder, fml-folder, markdown-folder, xdoc-folder and
xhtml-folder.

The following command should be executed to create the maven document site:
> **mvn site**

To link the markdown file in your custom menu add:
> **< item name="Good Style" href="md_file_name.html" />**

To link your results of the test cases you should execute the following command in terminal
> **mvn test**

To delete the created target folder you should perform:
> **mvn clean**

[**Return to README**](README.md)