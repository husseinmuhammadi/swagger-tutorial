# Swagger Tutorial

## Install Swagger

### Install Swagger Mannually

Download the latest version of swagger-editor and swagger-ui releases from [github](https://github.com/swagger-api)

You can download them from the link below:
https://github.com/swagger-api/swagger-ui/releases
https://github.com/swagger-api/swagger-editor/releases

### Install Swagger using Node Package Manager

#### Install http server
```
npm install -g http-server

cd swagger-editor
npm install 

cd swagger-ui
npm install 

http-server swagger-editor -a 127.0.0.1 -p 8080
http://localhost:8080

http-server swagger-ui -a 127.0.0.1 -p 8081
http://localhost:8081/dist
```

### Install Swagger using Docker Images
To get more information about [Swagger Installation](https://swagger.io/docs/open-source-tools/swagger-ui/usage/installation/)
```
docker pull swaggerapi/swagger-ui
docker run -p 80:8080 swaggerapi/swagger-ui
```

Get more information from [DockerHub](https://hub.docker.com/r/swaggerapi/swagger-ui)
```
docker pull swaggerapi/swagger-editor
docker run -d -p 80:8080 swaggerapi/swagger-editor
```
