import basic_setup as bs


def main():
    try:
        r = bs.execute("docker-compose -f docker/docker-compose-local.yml up")
        print(r.std_out)
        print(r.std_err)
    except KeyboardInterrupt:
        pass


if __name__ == '__main__':
    main()
