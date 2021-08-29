FROM tomcat:9.0

# FROM container will use the new entrypoint.sh file
COPY ./tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml

COPY ./context.xml /usr/local/tomcat/webapps.dist/manager/META-INF/context.xml

RUN ln -s /usr/local/tomcat/webapps.dist/manager webapps/manager
RUN ln -s /usr/local/tomcat/webapps.dist/host-manager webapps/host-manager
RUN ln -s /usr/local/tomcat/webapps.dist/ROOT webapps/ROOT

CMD ["catalina.sh", "run"]