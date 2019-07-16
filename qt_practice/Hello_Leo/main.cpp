#include <QApplication>
#include <QLabel>

int main(int argc, char* argv[]) {
    QApplication app(argc, argv);
    QLabel *label = new QLabel("Hello Leo!");
    label->setWindowTitle("I Love Leo!");
    label->show();
    label->resize(400, 100);
    label->setAlignment(Qt::AlignCenter);
    return app.exec();
}
