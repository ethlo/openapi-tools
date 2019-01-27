# OpenAPI-Generator groovy-models 
[![Maven Central](https://img.shields.io/maven-central/v/com.ethlo.openapi-tools/groovy-models.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.ethlo.openapi-tools.groovy-models%22)

Mostly a copy of the [OpenAPI-Generator JAXRS spec template set](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator/src/main/resources/JavaJaxRS/spec) to work with Groovy.

## Use
```
java -cp openapi-generator-cli-3.3.4.jar:groovy-models-0.1.jar org.openapitools.codegen.OpenAPIGenerator generate -ispecification/oas.yaml -gcom.ethlo.openapi.GroovyModelGenerator -otarget/generated-sources/models -Dmodels -DdateLibrary=java8 --model-package=spec -DuseSwaggerAnnotations=false
```
