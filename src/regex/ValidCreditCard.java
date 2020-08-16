package regex;
/**
 * use regex to validate credit card numbers. number format and validations ò credit card numbers from
 * multiple providers such as VISA, Mastercard, Amex and Diners.
 * 
 * On an actual credit card, the digits of the embossed card number are usually placed into groups of four.
 * That makes the card number easier for humans to read. Each of the credit card companies uses this number
 * format.
 * 
 * We'll exploit that difference of formats between each company to allow users to enter a number without
 * specifying a company. The company can be determined from the number. The format for each company is:
 * 		-Visa: 13 or 16 digits, starting with 4.
 * 		-Master card: 16 digits, starting with 51 through 55
 * 		-Discover: 16 digits, Starting with 6011 or 65.
 * 		-American Express: 15digits, starting with 34 or 37.
 * 		-Diners Club: 14 digits, starting with 300 through 305,36 or 38
 * 		-JCB: 15 digits, starting with 2131 or 1800, or 16 digits starting with 35. 
 * With spaces and hyphens stripped from the input, the next regular expression checks if the credit card 
 * number uses the format of any of the six major credit card companies. It uses named capture to detect 
 * which brand of credit card the customer has.
 * 
 * If you don't need to determine which type the card is, you can remove the six capturing groups that surround
 * the pattern for each card type, as they don't serve any other purpose.
 * @author thangnd3
 *
 */

public class ValidCreditCard {

}
