package com.shubham_kudekar.todoister.adapter;

import com.shubham_kudekar.todoister.model.Task;

public interface OnTodoClickListener {
    void onTodoClick( Task task);
    void onTodoRadioButtonClick(Task task);
}
