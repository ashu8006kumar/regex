package com
/**
 * Find number Given TEXT
 * Pick only those which start with digit ,end with digit and no char in those
 */
String input ="This is an example from which you have to extract number like 1234  or 354 but not a123"
def matchers= (input =~ /\b\d+\b/)
for (match in matchers) {
	println match
}