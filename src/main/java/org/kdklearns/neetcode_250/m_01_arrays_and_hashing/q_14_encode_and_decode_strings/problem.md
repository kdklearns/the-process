# Encode and Decode Strings

Create an algorithm that converts a list of strings into one string for transmission over a network. The receiving machine must reconstruct the original list from the transmitted string.

The sender, Machine 1, provides:

```cpp
string encode(vector<string> strs) {
    // Implement the encoder.
    return encoded_string;
}
```

The receiver, Machine 2, provides:

```cpp
vector<string> decode(string s) {
    // Implement the decoder.
    return strs;
}
```

The machines use these functions as follows:

```cpp
// Machine 1
string encoded_string = encode(strs);

// Machine 2
vector<string> strs2 = decode(encoded_string);
```

The reconstructed `strs2` must match `strs` exactly.

Implement both methods yourself. Serialization helpers, including `eval`, are prohibited.

## Example 1

```text
Input: dummy_input = ["Hello","World"]
Output: ["Hello","World"]
```

Explanation:

```text
Machine 1:
    Create an encoder.
    Encode ["Hello","World"] into a message.
    Send the message to Machine 2.

Machine 2:
    Create a decoder.
    Decode the message to recover ["Hello","World"].
```

## Example 2

```text
Input: dummy_input = [""]
Output: [""]
```

## Constraints

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- Each string may use any of the 256 characters specified by the problem's ASCII character set.

## Follow-up

Can your approach support an arbitrary character set?