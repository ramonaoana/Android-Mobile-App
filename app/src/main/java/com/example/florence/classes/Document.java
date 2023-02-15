package com.example.florence.classes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import net.sourceforge.jtds.jdbc.DateTime;

import java.util.Arrays;

public class Document {
    @SerializedName("firstName")
    @Expose
    private Integer documentId;

    @SerializedName("firstName")
    @Expose
    private Template template;

    @SerializedName("firstName")
    @Expose
    private User user;

    @SerializedName("firstName")
    @Expose
    private DateTime signingDate;

    @SerializedName("firstName")
    @Expose
    private byte[] contentDocument;

    public Document(Integer documentId, Template template, User user, DateTime signingDate, byte[] contentDocument) {
        this.documentId = documentId;
        this.template = template;
        this.user = user;
        this.signingDate = signingDate;
        this.contentDocument = contentDocument;
    }

    public Document(Template template, User user, DateTime signingDate, byte[] contentDocument) {
        this.template = template;
        this.user = user;
        this.signingDate = signingDate;
        this.contentDocument = contentDocument;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DateTime getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(DateTime signingDate) {
        this.signingDate = signingDate;
    }

    public byte[] getContentDocument() {
        return contentDocument;
    }

    public void setContentDocument(byte[] contentDocument) {
        this.contentDocument = contentDocument;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId=" + documentId +
                ", template=" + template +
                ", user=" + user +
                ", signingDate=" + signingDate +
                ", contentDocument=" + Arrays.toString(contentDocument) +
                '}';
    }
}
