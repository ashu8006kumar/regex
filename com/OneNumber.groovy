package com
/**
 * 
 * 
 * 
 * 
 * 
 * String must contain atleast on number(digit) 0-9
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
	//fail
	"1234222"
]
for (input in inputList) {
	def matchers= (input =~ /(?=.*?\d).+/)
	println "${input} => ${matchers.size()?'valid':'invalid'}"
}
