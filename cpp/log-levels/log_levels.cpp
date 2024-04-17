#include <string>

namespace log_line {
    std::string message(std::string line) {
        return line.substr(line.find(" ") + 1);
    }

    std::string log_level(std::string line) {
        return line.substr(line.find("[") + 1, line.find("]"));
    }

    std::string reformat(std::string line) {
        return std::string("Nope");
    }
}
