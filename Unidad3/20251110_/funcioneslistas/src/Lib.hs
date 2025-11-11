module Lib
  ( esPar
  , verificarPares
  , verificarIndicesPares
  ) where

esPar :: Int -> Bool
esPar n = n `mod` 2 == 0

-- Recorre recursivamente una lista y devuelve True o false si es par o no
verificarPares :: [Int] -> [Bool]
verificarPares []     = []
verificarPares (x:xs) = esPar x : verificarPares xs

-- verificarIndicesPares lista indices
-- Por cada índice mira el elemento correspondiente en lista e indica si es par o no 
verificarIndicesPares :: [Int] -> [Int] -> [Bool]
verificarIndicesPares _      []     = []
verificarIndicesPares lista (i:is) =
  esPar (lista !! i) : verificarIndicesPares lista is