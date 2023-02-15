package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Template {
    @SerializedName("templateId")
    @Expose
    private Integer templateId;

    @SerializedName("contentTemplate")
    @Expose
    private byte[] contentTemplate;

    public Template(Integer templateId, byte[] contentTemplate) {
        this.templateId = templateId;
        this.contentTemplate = contentTemplate;
    }

    public Template(byte[] contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public byte[] getContentTemplate() {
        return contentTemplate;
    }

    public void setContentTemplate(byte[] contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    @Override
    public String toString() {
        return "Template{" +
                "templateId=" + templateId +
                ", contentTemplate=" + Arrays.toString(contentTemplate) +
                '}';
    }
}
