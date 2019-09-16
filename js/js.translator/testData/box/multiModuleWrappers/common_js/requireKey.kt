// EXPECTED_REACHABLE_NODES: 1286
// MODULE: module1
// FILE: bar.kt
// MODULE_KIND: COMMON_JS
// REQUIRE_KEY: custom/key
fun bar() = "bar"

inline fun foo() = "foo" + bar()

// MODULE: main(module1)
// FILE: box.kt
// MODULE_KIND: COMMON_JS

fun box(): String {
    assertEquals("bar", bar())
    assertEquals("foobar", foo())

    return "OK"
}