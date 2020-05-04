package com
/**
 * Custom email regex
 * 1 . First char should be a alphabet
 * 2 . Second char on ward alphabet , digit, dot(.),and underscore (_)
 * 3 . Point 2 occurrence is (0 to many)
 * 4 . After above check for @
 * 5 . after Above one char 
 * 6 . combination of chars and digits end with dot(.)
 * 7 . Ends with 2,10 char
 * 8 . optional dot(.) follow by char 2,10 
 * 9 . case insensitive
 */

def  inputList = [
	"Some_thing.007@some.com",
	// valid
	"some_thing.007@some.com",
	//valid
	"1some_thing.007@some.com",//Invalid
]
for (input in inputList) {
	def matcher= (input =~ /^(?i)([a-z]{1}[a-z\d_\.]*)@([a-z][a-z\d]+\.)[a-z\d]{2,10}(?:\.[a-z]{2,10})?$/)
	println matcher.size()?"Valid" :"Invalid"
}

