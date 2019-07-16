#include "my_window.h"
#include "ui_mywindow.h"

MyWindow::MyWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MyWindow)
{
    ui->setupUi(this);
}

MyWindow::~MyWindow()
{
    delete ui;
}

void MyWindow::on_pushButtonClose_clicked()
{
    if(ui->label->text() == "Leo is my favorite cat") {
        ui->label->setText("He's a cat who sometimes wears hats!");
    }
    else {
        ui->label->setText("Leo is my favorite cat");
    }
}
