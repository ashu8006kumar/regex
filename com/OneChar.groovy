package com
/**
 * 
 * 
 * 
 * 
 * 
 * String must contain atleast one char(a-zA-z)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author ashish
 *
 */
def inputList=[
	"asdfghjkl1",
	"asdfghj1kl",
	"1asdfghjkl",
	"asdfghjkl",
	"ABC777BN",
	"1234222" //fail
]
for (input in inputList) {
	def matchers= (input =~ /(?i)(?=.*?[a-z]).+/)
	println "${input} => ${matchers.size()?'valid':'invalid'}"
}
