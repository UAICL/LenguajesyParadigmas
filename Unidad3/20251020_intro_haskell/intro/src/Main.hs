module Main (main) where

main :: IO ()
main = do
  putStrLn "En la carpeta ejemplos esta el codigo de varios ejemplos." 
  putStrLn "Para correrlos, abrir una terminal en esta carpeta y usar 'runhaskell ejemplos/nombre_del_ejemplo.hs'"
  putStrLn "Por ejemplo: 'runhaskell ejemplos/1_holamundo.hs'"
  putStrLn "Tambien se pueden compilar con 'stack ghc ejemplos/nombre_del_ejemplo.hs' y luego correr el ejecutable generado." 
  putStrLn "stack ghc -- ejemplos/2_sumafuncion.hs -o out.o"
  putStrLn "Luego correr con './out.o'"