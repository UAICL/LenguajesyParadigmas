main :: IO ()
main = do
    putStrLn "Ingrese el primer número:"
    input1 <- getLine
    putStrLn "Ingrese el segundo número:"
    input2 <- getLine

    -- Convertir los strings a números
    let num1 = read input1 :: Int
    let num2 = read input2 :: Int
    let suma = num1 + num2

    putStrLn ("La suma es: " ++ show suma)