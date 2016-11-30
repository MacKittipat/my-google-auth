# my-google-auth
Generate OTP from command line instead of Google Authenticator in mobile phone.

# How to use
1. Store secret in config file for example `~/.my-google-auth`
2. Run `java -jar my-google-auth.jar ~/.my-google-auth`
3. OTP will be copy to your clipboard and it will be valid for 30 seconds.

# Config file 

- secret : Your secret key
- prefix-password (Optional) : Your static password. It will be prepend to OTP.

# Example 

File name : .my-google-auth

```yaml
secret: ''
prefix-password: ''
```

# Set alias 

```
alias mga="java -jar ~/Apps/my-google-auth.jar ~/.my-google-auth"
```

# Credit

This is the library that I use for generating OTP : https://github.com/aerogear/aerogear-otp-java
