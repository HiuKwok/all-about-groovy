package groovyDoc.ch1_3

/**
 * Unlike Java, it's not required to always have a class to wrap your content,
 * this is also why Groovy is a scripting language, but not system language.
 *
 */
println 'Hello'

int power(int n) { 2**n }

println "2^6==${power(6)}"

/**
 * Also variable can be declared directly without type,
 * however in this case, the var will be accessible outside of this script file.
 */
x = 1
y = 2
assert x+y == 3