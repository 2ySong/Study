cmake_minimum_required(VERSION 3.20)
project(day06_function)

set(CMAKE_CXX_STANDARD 14)

add_executable(day06_function main.cpp)

add_executable(function01 function01.cpp)
add_executable(function02 function02.cpp)

add_executable(point point.cpp)
add_executable(max test/max.cpp)

add_executable(test test/test.cpp)