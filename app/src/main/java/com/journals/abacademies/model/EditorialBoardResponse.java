package com.journals.abacademies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EditorialBoardResponse {


    @SerializedName("editorial_cnt")
    private int editorialCnt;
    @SerializedName("editorialboardarr")
    private List<EditorialboardarrBean> editorialboardarr;

    public int getEditorialCnt() {
        return editorialCnt;
    }

    public void setEditorialCnt(int editorialCnt) {
        this.editorialCnt = editorialCnt;
    }

    public List<EditorialboardarrBean> getEditorialboardarr() {
        return editorialboardarr;
    }

    public void setEditorialboardarr(List<EditorialboardarrBean> editorialboardarr) {
        this.editorialboardarr = editorialboardarr;
    }

    public static class EditorialboardarrBean {
        @SerializedName("ename")
        private String ename;
        @SerializedName("editor_description")
        private String editorDescription;
        @SerializedName("editor_type")
        private String editorType;

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getEditorDescription() {
            return editorDescription;
        }

        public void setEditorDescription(String editorDescription) {
            this.editorDescription = editorDescription;
        }

        public String getEditorType() {
            return editorType;
        }

        public void setEditorType(String editorType) {
            this.editorType = editorType;
        }
    }
}
