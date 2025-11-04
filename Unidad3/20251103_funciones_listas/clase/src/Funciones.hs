-- de esta forma exporta sólo las funciones saludar, sumar y cuadrado
module Funciones (saludar, sumar, cuadrado, fibonacci) where


saludar :: String -> IO ()
saludar nombre = putStrLn ("Hola, " ++ nombre ++ "!")

sumar :: Int -> Int -> Int
sumar x y = x + y

cuadrado :: Int -> Int
cuadrado x = x * x

 
-- Lista infinita con memoización implícita
fibs :: [Integer] -- se define una lista de int
fibs = 0 : 1 : zipWith (+) fibs (tail fibs) -- suma los elementos de la lista consigo misma desplazada una posición

-- Devuelve el n-ésimo número de Fibonacci
fibonacci :: Int -> Integer
fibonacci n = fibs !! n
