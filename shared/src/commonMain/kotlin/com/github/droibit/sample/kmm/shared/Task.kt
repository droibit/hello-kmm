package com.github.droibit.sample.kmm.shared

inline class Timestamp(val nanoseconds: Double)

data class Task(
    val title: String,
    val createdAt: Timestamp
)