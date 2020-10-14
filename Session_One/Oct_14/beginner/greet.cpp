#include <iostream>

int main() {

  std::string name;
  std::string pokemon;
  std::cout << "Hello! What's your name?\n";
  std::cin >> name;
  std::cout << "Nice to meet you, " << name << "\n";
  std::cout << "What is your favorite Pokemon?\n";
  std::cin >> pokemon;
  std::cout << name<< "\'s favorite Pokemon is " << pokemon;
  return 0;
}
