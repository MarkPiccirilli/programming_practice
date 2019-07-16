#include "signalsslots.h"
#include "ui_signalsslots.h"

SignalsSlots::SignalsSlots(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::SignalsSlots)
{
    ui->setupUi(this);
    connect(ui->horizontalSlider, SIGNAL(valueChanged(int)), ui->progressBar, SLOT(setValue(int)));
}

SignalsSlots::~SignalsSlots()
{
    delete ui;
}
