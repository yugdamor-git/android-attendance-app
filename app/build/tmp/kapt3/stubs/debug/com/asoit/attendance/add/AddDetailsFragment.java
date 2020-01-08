package com.asoit.attendance.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/asoit/attendance/add/AddDetailsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "branchSpinner", "Landroid/widget/Spinner;", "getBranchSpinner", "()Landroid/widget/Spinner;", "setBranchSpinner", "(Landroid/widget/Spinner;)V", "date", "Landroid/widget/TextView;", "getDate", "()Landroid/widget/TextView;", "setDate", "(Landroid/widget/TextView;)V", "lectureSpinner", "getLectureSpinner", "setLectureSpinner", "note", "Landroid/widget/EditText;", "getNote", "()Landroid/widget/EditText;", "setNote", "(Landroid/widget/EditText;)V", "semSpinner", "getSemSpinner", "setSemSpinner", "total", "getTotal", "setTotal", "viewModel", "Lcom/asoit/attendance/add/AddDetailsViewModel;", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "Companion", "app_debug"})
public final class AddDetailsFragment extends androidx.fragment.app.Fragment {
    private com.asoit.attendance.add.AddDetailsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Spinner branchSpinner;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Spinner semSpinner;
    @org.jetbrains.annotations.NotNull()
    public android.widget.Spinner lectureSpinner;
    @org.jetbrains.annotations.NotNull()
    public android.widget.TextView date;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText total;
    @org.jetbrains.annotations.NotNull()
    public android.widget.EditText note;
    public static final com.asoit.attendance.add.AddDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getBranchSpinner() {
        return null;
    }
    
    public final void setBranchSpinner(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSemSpinner() {
        return null;
    }
    
    public final void setSemSpinner(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getLectureSpinner() {
        return null;
    }
    
    public final void setLectureSpinner(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public AddDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/asoit/attendance/add/AddDetailsFragment$Companion;", "", "()V", "newInstance", "Lcom/asoit/attendance/add/AddDetailsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.asoit.attendance.add.AddDetailsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}