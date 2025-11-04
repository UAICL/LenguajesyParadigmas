module Main (main) where

import Funciones

main :: IO ()
main = do
  saludar "Matías"
  putStrLn ("2 + 3 = " ++ show (sumar 2 3))
  putStrLn ("El cuadrado de 4 es " ++ show (cuadrado 4))

  print (fibonacci 10)  -- 55
  print (fibonacci 35)  -- rápido, gracias a memoización  

  let ll = [1, 2, 3, 4]
  print (map cuadrado ll)  -- [1,4,9,16,
  print (head ll)  -- 30
  print (tail ll)

  print (take 2 ll)  -- primeros 2 números de Fibonacci

  print( filter odd ll )  -- números pares de la lista
  print( filter even ll )  -- números pares de la lista
  print( filter (>3) ll )  -- números pares de la lista

  print("Hola No" ++ show(10+11))