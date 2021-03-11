package com.journals.abacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryResponse {


    @SerializedName("status")
    private boolean status;
    @SerializedName("journals_cnt")
    private int journalsCnt;
    @SerializedName("journal_details")
    private List<JournalDetailsBean> journalDetails;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getJournalsCnt() {
        return journalsCnt;
    }

    public void setJournalsCnt(int journalsCnt) {
        this.journalsCnt = journalsCnt;
    }

    public List<JournalDetailsBean> getJournalDetails() {
        return journalDetails;
    }

    public void setJournalDetails(List<JournalDetailsBean> journalDetails) {
        this.journalDetails = journalDetails;
    }

    public static class JournalDetailsBean {
        @SerializedName("flyerimg")
        private String flyerimg;
        @SerializedName("home_url")
        private String homeUrl;
        @SerializedName("inst_url")
        private String instUrl;
        @SerializedName("rel_keyword")
        private String relKeyword;
        @SerializedName("eb_url")
        private String ebUrl;
        @SerializedName("ci_url")
        private String ciUrl;
        @SerializedName("track_paper")
        private String trackPaper;
        @SerializedName("journal")
        private String journal;
        @SerializedName("managejournal")
        private String managejournal;

        public String getFlyerimg() {
            return flyerimg;
        }

        public void setFlyerimg(String flyerimg) {
            this.flyerimg = flyerimg;
        }

        public String getHomeUrl() {
            return homeUrl;
        }

        public void setHomeUrl(String homeUrl) {
            this.homeUrl = homeUrl;
        }

        public String getInstUrl() {
            return instUrl;
        }

        public void setInstUrl(String instUrl) {
            this.instUrl = instUrl;
        }

        public String getRelKeyword() {
            return relKeyword;
        }

        public void setRelKeyword(String relKeyword) {
            this.relKeyword = relKeyword;
        }

        public String getEbUrl() {
            return ebUrl;
        }

        public void setEbUrl(String ebUrl) {
            this.ebUrl = ebUrl;
        }

        public String getCiUrl() {
            return ciUrl;
        }

        public void setCiUrl(String ciUrl) {
            this.ciUrl = ciUrl;
        }

        public String getTrackPaper() {
            return trackPaper;
        }

        public void setTrackPaper(String trackPaper) {
            this.trackPaper = trackPaper;
        }

        public String getJournal() {
            return journal;
        }

        public void setJournal(String journal) {
            this.journal = journal;
        }

        public String getManagejournal() {
            return managejournal;
        }

        public void setManagejournal(String managejournal) {
            this.managejournal = managejournal;
        }
    }
}
