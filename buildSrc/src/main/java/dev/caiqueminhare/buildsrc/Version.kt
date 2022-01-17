package dev.caiqueminhare.buildsrc

data class Version(
    val major: Int,
    val minor: Int) {
    val name: String
        get() = "$major.$minor"

    val code: Int
        get() = minor + major
}