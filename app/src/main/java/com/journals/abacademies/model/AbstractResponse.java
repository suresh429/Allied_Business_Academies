package com.journals.abacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AbstractResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("abstract")
    private int abstractX;
    @SerializedName("abstract_details")
    private List<AbstractDetailsBean> abstractDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAbstractX() {
        return abstractX;
    }

    public void setAbstractX(int abstractX) {
        this.abstractX = abstractX;
    }

    public List<AbstractDetailsBean> getAbstractDetails() {
        return abstractDetails;
    }

    public void setAbstractDetails(List<AbstractDetailsBean> abstractDetails) {
        this.abstractDetails = abstractDetails;
    }

    public static class AbstractDetailsBean {
        @SerializedName("sno")
        private String sno;
        @SerializedName("journal")
        private String journal;
        @SerializedName("title")
        private String title;
        @SerializedName("author_names")
        private String authorNames;
        @SerializedName("keywords")
        private String keywords;
        @SerializedName("abstract")
        private String abstractX;
        @SerializedName("doi_num")
        private Object doiNum;
        @SerializedName("abstractlink")
        private String abstractlink;
        @SerializedName("pdflink")
        private String pdflink;
        @SerializedName("fulltextlink")
        private String fulltextlink;
        @SerializedName("month")
        private String month;
        @SerializedName("year")
        private String year;
        @SerializedName("page_num")
        private Object pageNum;
        @SerializedName("lpage_num")
        private String lpageNum;
        @SerializedName("pub_date")
        private String pubDate;
        @SerializedName("date")
        private String date;
        @SerializedName("art_type")
        private String artType;
        @SerializedName("domain_name")
        private String domainName;
        @SerializedName("vol")
        private String vol;
        @SerializedName("issue")
        private String issue;
        @SerializedName("vol_issue_name")
        private String volIssueName;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthorNames() {
            return authorNames;
        }

        public void setAuthorNames(String authorNames) {
            this.authorNames = authorNames;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public Object getDoiNum() {
            return doiNum;
        }

        public void setDoiNum(Object doiNum) {
            this.doiNum = doiNum;
        }

        public String getAbstractlink() {
            return abstractlink;
        }

        public void setAbstractlink(String abstractlink) {
            this.abstractlink = abstractlink;
        }

        public String getPdflink() {
            return pdflink;
        }

        public void setPdflink(String pdflink) {
            this.pdflink = pdflink;
        }

        public String getFulltextlink() {
            return fulltextlink;
        }

        public void setFulltextlink(String fulltextlink) {
            this.fulltextlink = fulltextlink;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public Object getPageNum() {
            return pageNum;
        }

        public void setPageNum(Object pageNum) {
            this.pageNum = pageNum;
        }

        public String getLpageNum() {
            return lpageNum;
        }

        public void setLpageNum(String lpageNum) {
            this.lpageNum = lpageNum;
        }

        public String getPubDate() {
            return pubDate;
        }

        public void setPubDate(String pubDate) {
            this.pubDate = pubDate;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getArtType() {
            return artType;
        }

        public void setArtType(String artType) {
            this.artType = artType;
        }

        public String getDomainName() {
            return domainName;
        }

        public void setDomainName(String domainName) {
            this.domainName = domainName;
        }

        public String getVol() {
            return vol;
        }

        public void setVol(String vol) {
            this.vol = vol;
        }

        public String getIssue() {
            return issue;
        }

        public void setIssue(String issue) {
            this.issue = issue;
        }

        public String getVolIssueName() {
            return volIssueName;
        }

        public void setVolIssueName(String volIssueName) {
            this.volIssueName = volIssueName;
        }
    }
}
