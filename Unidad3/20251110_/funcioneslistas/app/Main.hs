module Main where

import Lib

main :: IO ()
main = do
  let lista = [1..10]

  putStrLn "Lista:"
  print lista

  putStrLn "\n¿Cada elemento es par?"
  print (verificarPares lista)

  let lista2   = [10, 3, 7, 8]
  let indices = [0, 2, 3]

  print (verificarIndicesPares lista2 indices)
