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
 */

String input ="some_thing.007@some.com"
def matcher= (input =~ /^([a-z][a-z\d_\.]*)@([a-z][a-z\d]+\.)[a-z\d]{2,10}(?:\.[a-z]{2,10})?$/)
matcher.size()?"Valid" :"Invalid"
