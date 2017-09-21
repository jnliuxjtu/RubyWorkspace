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
<<<<<<< HEAD
#111
=======
>>>>>>> ee0f040b8a8f42d5c4da249fc86fa5604d108f85
#333
puts "Hello World!\n"
puts "Hello World!\n"
puts fizzbuzz(15)
puts fizzbuzz(15)
puts fizzbuzz(15)
