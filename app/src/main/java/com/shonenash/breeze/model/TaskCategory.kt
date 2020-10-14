package com.shonenash.breeze.model

data class TaskCategory (
    val categoryName: String,
    val isComplete: Boolean,
    val isStarred: Boolean,
    val taskList: List<Task>
)