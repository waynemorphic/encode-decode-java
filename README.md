# PROBLEM
Implement a Caesar cipher, both encoding, and decoding.
The key is an integer from 1 to 25. This cipher rotates the 
letters of the alphabet (A to Z). The encoding replaces each 
letter with the 1st to 25th next letter in the alphabet (wrapping Z to A).
So key 2 encrypts "HI" to "JK", but key 20 encrypts "HI" to "BC".

# Expected Result
Eventually, when your logic for encrypting and decrypting a 
String input (and well-tested), work on displaying the encrypted
and decrypted data, like this:<br>
Input String: `THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG`<br>
Encrypted String: `QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD`<br>
Decrypted String: `THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG`<br>