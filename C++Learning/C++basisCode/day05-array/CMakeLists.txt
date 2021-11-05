cmake_minimum_required(VERSION 3.20)
project(day05_array)

set(CMAKE_CXX_STANDARD 14)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -fexec-charset=GBK")
add_executable(day05_array main.cpp)

add_executable(ArrayInverse ArrayInverse.cpp)

add_executable(BubbleSort BubbleSort.cpp)
add_executable(array_ array_.cpp)
add_executable(two_dimensional_array two_dimensional_array.cpp)
add_executable(scores scores.cpp)