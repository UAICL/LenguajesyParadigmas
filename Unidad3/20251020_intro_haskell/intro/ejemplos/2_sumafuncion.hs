sumar :: Int -> Int -> Int
sumar x y = x + y

elevadoAlCuadrado :: Int -> Int
elevadoAlCuadrado x = x * x
  
main :: IO ()
main = do
    let num1 = 22
    let num2 = 8
    let resultado = elevadoAlCuadrado (sumar num1 num2)

    putStrLn ("La suma es: " ++ show resultado)