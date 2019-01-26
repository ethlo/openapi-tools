package com.ethlo.openapi;

import java.io.File;

import org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen;

public class GroovyModelGenerator extends JavaJAXRSSpecServerCodegen
{
    public GroovyModelGenerator()
    {
        this.modelTemplateFiles.forEach((k, v) -> {
            this.modelTemplateFiles.put(k, ".groovy");
        });

        super.sourceFolder = "";
        super.embeddedTemplateDir = templateDir = JAXRS_TEMPLATE_DIRECTORY_NAME + File.separator + "spec-groovy";
    }
}
