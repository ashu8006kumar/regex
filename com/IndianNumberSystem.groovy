package com
/**

100000 pass
1,00,000 pass
10,00,000 pass
10,000 pass
1,000 pass
10 pass
1,00,00,000 pass

10,00,00 fail
100,000 fail
1,000,000 fail
10,000,000 fail
*/

def inputList =[
	"100000",
	//pass
	"1,00,000",
	//pass
	"10,00,000",
	// pass
	"10,000",
	// pass
	"1,000",
	// pass
	"10",
	// pass
	"1,00,00,000",
	// pass

	"10,00,00",
	// fail
	"100,000",
	// fail
	"1,000,000",
	// fail
	"10,000,000",
	// fail

	"-1,000"
	// pass
]
for (input in inputList) {
	def matchers= (input =~ /^-?(?:\d+|\d{1,2},(?:\d{2},)*\d{3})$/)
	if(matchers.size()) {

	}
	println "${input} => ${matchers.size()?'pass':'fail'}"
}
