package com.journals.abacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentIssueResponse {

    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("currentissue_cnt")
    private int currentissueCnt;
    @SerializedName("currentissue_details")
    private List<CurrentissueDetailsBean> currentissueDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCurrentissueCnt() {
        return currentissueCnt;
    }

    public void setCurrentissueCnt(int currentissueCnt) {
        this.currentissueCnt = currentissueCnt;
    }

    public List<CurrentissueDetailsBean> getCurrentissueDetails() {
        return currentissueDetails;
    }

    public void setCurrentissueDetails(List<CurrentissueDetailsBean> currentissueDetails) {
        this.currentissueDetails = currentissueDetails;
    }

    public static class CurrentissueDetailsBean {
        @SerializedName("sno")
        private String sno;
        @SerializedName("month")
        private String month;
        @SerializedName("year")
        private String year;
        @SerializedName("title")
        private String title;
        @SerializedName("author_names")
        private String authorNames;
        @SerializedName("abstractlink")
        private String abstractlink;
        @SerializedName("pdflink")
        private String pdflink;
        @SerializedName("fulltextlink")
        private String fulltextlink;
        @SerializedName("sup_file")
        private String supFile;
        @SerializedName("art_type")
        private String artType;
        @SerializedName("page_num")
        private Object pageNum;
        @SerializedName("lpage_num")
        private String lpageNum;
        @SerializedName("doi_num")
        private Object doiNum;
        @SerializedName("journal")
        private String journal;
        @SerializedName("vol")
        private String vol;
        @SerializedName("issue")
        private String issue;

        public String getSno() {
            return sno;
        }

        public void setSno(String sno) {
            this.sno = sno;
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

        public String getSupFile() {
            return supFile;
        }

        public void setSupFile(String supFile) {
            this.supFile = supFile;
        }

        public String getArtType() {
            return artType;
        }

        public void setArtType(String artType) {
            this.artType = artType;
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

        public Object getDoiNum() {
            return doiNum;
        }

        public void setDoiNum(Object doiNum) {
            this.doiNum = doiNum;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
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
    }
}
