def fizzbuzz(n)
    ans = Array.new
    for i in 1..n
        if i%3==0 and i%5==0
            ans<<"FizzBuzz"
        elsif i%3==0
            ans<<"Fizz"
        elsif i%5==0
            ans<<"Buzz"
        else
            ans<<i.to_s
        end
    end
    return ans
end
#111
#333
puts "Hello World!\n"
puts "Hello World!\n"
puts fizzbuzz(15)
puts fizzbuzz(15)
puts fizzbuzz(15)
