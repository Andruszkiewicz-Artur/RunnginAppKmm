package com.andruszkiewiczarturmobiledev.runningappkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform