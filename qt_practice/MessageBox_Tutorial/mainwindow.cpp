#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QMessageBox>
#include <QDebug>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
}

MainWindow::~MainWindow()
{
    delete ui;
}

void MainWindow::on_pushButton_clicked()
{
    //QMessageBox::about(this,  "My Title", "this is my custom message!");
    //QMessageBox::aboutQt(this, "My title");
    //QMessageBox::critical(this, "My Title", "this is my critical custom message!");
    //QMessageBox::information(this, "My Title", "this is my information custom message!");
    //QMessageBox::warning(this, "My Title", "this is my warning custom message!");
    QMessageBox::StandardButton reply = QMessageBox::question(this, "My Title", "this is my question custom message?", QMessageBox::Yes | QMessageBox::No);
    if(reply == QMessageBox::Yes) {
        QApplication::quit();
    }
    else {
        qDebug() << "No is clicked";
    }
}
