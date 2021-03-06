package com.journals.abacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ArchiveResponse {


    @SerializedName("archive_year_cnt")
    private int archiveYearCnt;
    @SerializedName("status")
    private boolean status;
    @SerializedName("message")
    private String message;
    @SerializedName("archive_years")
    private List<ArchiveYearsBean> archiveYears;

    public int getArchiveYearCnt() {
        return archiveYearCnt;
    }

    public void setArchiveYearCnt(int archiveYearCnt) {
        this.archiveYearCnt = archiveYearCnt;
    }

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

    public List<ArchiveYearsBean> getArchiveYears() {
        return archiveYears;
    }

    public void setArchiveYears(List<ArchiveYearsBean> archiveYears) {
        this.archiveYears = archiveYears;
    }

    public static class ArchiveYearsBean {
        @SerializedName("year")
        private String year;
        @SerializedName("archive_details")
        private List<ArchiveDetailsBean> archiveDetails;

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public List<ArchiveDetailsBean> getArchiveDetails() {
            return archiveDetails;
        }

        public void setArchiveDetails(List<ArchiveDetailsBean> archiveDetails) {
            this.archiveDetails = archiveDetails;
        }

        public static class ArchiveDetailsBean {
            @SerializedName("year")
            private String year;
            @SerializedName("vol")
            private String vol;
            @SerializedName("issue")
            private String issue;
            @SerializedName("vol_issue_name")
            private String volIssueName;
            @SerializedName("journal")
            private String journal;
            @SerializedName("date")
            private String date;
            @SerializedName("month")
            private String month;
            @SerializedName("vol_issue_url")
            private String volIssueUrl;

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
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

            public String getJournal() {
                return journal;
            }

            public void setJournal(String journal) {
                this.journal = journal;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getMonth() {
                return month;
            }

            public void setMonth(String month) {
                this.month = month;
            }

            public String getVolIssueUrl() {
                return volIssueUrl;
            }

            public void setVolIssueUrl(String volIssueUrl) {
                this.volIssueUrl = volIssueUrl;
            }
        }
    }
}
