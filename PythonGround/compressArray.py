def compress(chars):
    write = anchor = 0
    for read,c in enumerate(chars):
        if read + 1 == len(chars) or chars[read + 1] != c:
            chars[write] = chars[anchor]
            write = write + 1
        if read > anchor:
            for digit in str(read - anchor + 1):
                chars[write] = digit
                write = write + 1
        anchor = read + 1
    return write


print(compress(["a","b","b"]))